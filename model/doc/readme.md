
```drawio-resource
../lifecycle.drawio
```

An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of stages and stage occupancy: lifecycle definitions with Jira-style transitions, and dated sojourn records on the elements that live through them. Defined in [`lifecycle.xcore`](lifecycle.xcore). It is the "lifecycle" floor of the micro-model tower, directly above the [seal model](../../ai-dashboard/seal/seal.xcore), and it applies to anything with a lifecycle the way the [IAM model](../../ai-dashboard/iam/iam.xcore) applies to anything which needs protection.

The model generalizes the Product Management model's [`Lifecycle`](https://product-management.models.nasdanika.org/references/eClassifiers/Lifecycle/index.html), which captures a capability provider's lifecycle as a fixed enumeration. The move is the same one the IAM model made with `Action` and the work model with `WorkType`: what was an enum becomes instance data. Organizations define their own lifecycles as catalogs; elements record which stages they occupied, when, moved by whom; and one element may live through several lifecycles at once.

## Competitive landscape

**Jira and its workflow schemes.** The strongest prior art and the vocabulary this model deliberately borrows: workflows as statuses plus transitions, global transitions, status categories, schemes mapping issue types to workflows. But the workflow lives inside Jira, applies only to issues, and the status history - the actual record - sits behind an API in a proprietary shape. The model takes the design and removes the walls: any element, any repo, history as first-class data.

**BPM engines.** Camunda, Flowable, and the BPMN tradition are execution-centric: a process instance runs, a token moves. Most elements with lifecycles - a capability, a document, a decision, a model - are not process instances, and modeling their status as a running process is a category error that BPM adoption stories repeatedly stumble over. Here transitions are data consulted at the moment of change; execution is deliberately out of scope.

**The status column, everywhere.** The real competitor, as usual: every tool hardcodes its own status enum - CRM stages, document states, ticket statuses, CMDB lifecycle fields - and reconciling them across tools is manual. A shared typed substrate makes "everything in stage X across the estate" a query rather than an export exercise.

## What a typed model adds

**Stages are data, not enums.** A `Lifecycle` is a catalog: authored once, versioned, shipped as a Maven artifact, referenced by many elements. An editorial lifecycle, a deprecation lifecycle, a capability maturity ladder - each is instance data, so adding a stage is a data change, not a metamodel release. Hierarchical stages generalize Jira's status categories: conditions and reports bind at "active" while sojourns record the leaf.

**Sojourns are the record.** A `Sojourn` is a dated period in a stage, attributable to the IAM `Subject` who moved the element - and, because it extends the seal model's `SealedElement`, signable. An approval gate is a transition guard demanding a signed sojourn: the sign-off rides on exactly the record that needed it, which is the typed reason this floor sits above seal. Sojourns are never rewritten; corrections are new sojourns. Version control for status.

**Multiple lifecycles per element.** A document with an editorial lifecycle and a compliance lifecycle, a capability with a maturity ladder and a support lifecycle: `Staged.lifecycles` declares participation, the sojourn history is one list, and the current stage is derived per lifecycle. No tool in the landscape does this cleanly; most force the second lifecycle into labels.

**Time is a query.** Cycle time, aging, time-in-stage, WIP per stage - all queries over sojourn periods, across every model in the tower at once, not per-tool reports.

**Stage-scoped behavior below stays decoupled.** IAM access conditions and seal variant selection mention stages as string expressions (`subject.stage == "published"`) precisely so those floors do not depend on this one; the derived current stages here are what those expressions evaluate against. Stage-scoped visibility, stage-scoped variants, and lifecycle-gated decisions compose without any floor reaching upward.

## Applications

**The tower itself.** `Staged` is the base the next floor re-parents to: the [decision analysis model](../decision-analysis/README.md)'s `Comparand` extends it, so analyses are drafted, judged, and closed; judgments retractable; catalogs published and retired - and everything above (bindings, controls, work, architecture elements, threats) has a lifecycle by inheritance. Delphi rounds in an expert panel are lifecycle data over judgment records. The decision binding model's hand-rolled `VariationPointState` becomes a candidate for retirement into a variation-point lifecycle.

**Capability provider lifecycles.** The originating case: the Product Management model's enumeration re-lands here as a catalog, and capability maturity (per the capability model plan) becomes a lifecycle whose sojourns are dated, evidenced assessments rather than a static attribute.

**Segregation of duties, demonstrably.** Composed with IAM and governance: the subject who moves an element into `review` cannot be the one who moves it to `approved` - a guard over sojourn attribution, auditable from the record.

**Generated sites with stage awareness.** Published versus draft versus retired pages, stage badges on element pages, aging reports - all generated views over sojourns, the same posture as board reporting in the [CISO model](../ciso/README.md).

## Model overview

| Area | Types |
|------|-------|
| Extension point | `Staged` (anything with a lifecycle; extends seal `SealedElement`; derived `current`) |
| Definitions | `Lifecycle` (stages, transitions, `initial`), `Stage` (hierarchical), `Transition` (`from` empty = global, `guard`) |
| Occupancy | `Sojourn` (period, `stage`, `by`, signable, never rewritten) |
| Reused, not redefined | iam `Subject`, access control; seal `SealedElement`, `Signature` |

## Relation to other Nasdanika work

Base classes come from the [IAM model](https://iam.models.nasdanika.org) via the [seal model](https://seal.models.nasdanika.org): `Staged extends SealedElement`, and the seal dependency is typed - signed sojourns are how approvals attach to transitions. The [decision analysis model](https://analysis.decision.models.nasdanika.org) re-parents its `Comparand` to `Staged`, carrying the chain upward (nxcore < role < iam < seal < lifecycle < decision-analysis < decision-binding < ...). 

