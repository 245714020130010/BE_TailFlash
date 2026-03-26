# FE Endpoint to DTO Mapping Checklist

Use this checklist when extracting API contracts from frontend code and converting them into backend DTO contracts.

## A) Locate FE API usages

- [ ] Find axios/fetch wrappers and raw calls.
- [ ] Find route constants and endpoint builder helpers.
- [ ] Find request/response types or interfaces near call sites.
- [ ] Record auth headers and token patterns used by FE.

## B) Build endpoint inventory

For each endpoint found, capture:

- [ ] HTTP method
- [ ] FE route path
- [ ] Query params
- [ ] Path params
- [ ] Request body shape
- [ ] Expected response shape
- [ ] Error handling shape in FE
- [ ] Caller screens/features

Suggested table columns:
| Feature | Method | FE Path | BE Path | Request DTO | Response DTO | Error Code | Notes |

## C) Map FE contract to backend DTOs

- [ ] Create one request DTO per operation when shape differs.
- [ ] Create one response DTO per operation when projection differs.
- [ ] Keep naming stable and explicit (CreateDeckRequest, DeckDetailResponse, etc.).
- [ ] Do not expose entity directly.
- [ ] Align field nullability with FE expectations.

## D) Validate envelope and errors

- [ ] Confirm response envelope: success/data/error.
- [ ] Map exception to stable error codes.
- [ ] Ensure FE can distinguish validation, auth, forbidden, not-found, conflict, and server errors.
- [ ] Verify HTTP status set: 400, 401, 403, 404, 409, 422, 500.

## E) Resolve gaps and UNKNOWN

- [ ] Mark unknown business rules as UNKNOWN.
- [ ] Add assumption with reason and impact.
- [ ] Add question for product/FE confirmation.
- [ ] Prefer FE-observed behavior when docs are incomplete.

## F) Completion checks

- [ ] Every FE-called endpoint has mapped DTOs.
- [ ] Sample JSON request/response is documented.
- [ ] Contract diffs impacting FE include backward compatibility plan.
- [ ] Contract summary is included in handoff output.
