# Exception to ErrorCode Mapping Checklist

Use this checklist to design and validate consistent exception-to-error-code mapping for backend APIs.

## A) Error envelope baseline

- [ ] Confirm response envelope is stable: success/data/error.
- [ ] Ensure error object includes: code, message, details.
- [ ] Keep code machine-readable and stable across releases.

## B) Mapping matrix setup

Create and maintain a matrix with columns:
| Source Exception | Error Code | HTTP Status | User Message | details Shape | Notes |

- [ ] Include framework-level exceptions (validation, method not allowed, parse errors).
- [ ] Include domain exceptions (business rule violations).
- [ ] Include infra exceptions (DB conflict, timeout, external service failure).

## C) Naming convention for error codes

- [ ] Use uppercase snake case: RESOURCE_NOT_FOUND, INVALID_REQUEST, DUPLICATE_DECK_NAME.
- [ ] Prefix by bounded context when needed: AUTH_INVALID_CREDENTIALS, DECK_NOT_FOUND.
- [ ] Avoid generic unstable codes: UNKNOWN_ERROR_1.

## D) HTTP status consistency

- [ ] 400 for malformed or invalid request syntax.
- [ ] 401 for unauthenticated requests.
- [ ] 403 for authenticated but forbidden actions.
- [ ] 404 for missing resources.
- [ ] 409 for conflict state.
- [ ] 422 for semantic validation/business constraints.
- [ ] 500 for unhandled internal errors.

## E) Handler implementation checks

- [ ] Centralize mapping in global exception handler.
- [ ] Do not leak stack traces or sensitive data.
- [ ] Keep user message safe and concise.
- [ ] Put debug hints in details only when safe and needed.

## F) FE compatibility checks

- [ ] FE can branch behavior by error code and status.
- [ ] Existing FE-handled codes remain backward compatible.
- [ ] Contract changes include impact notes and migration guidance.

## G) Test coverage checks

- [ ] Unit tests for mapping function/handler.
- [ ] Integration tests for representative endpoints and failures.
- [ ] Snapshot/assertion tests for envelope shape.
