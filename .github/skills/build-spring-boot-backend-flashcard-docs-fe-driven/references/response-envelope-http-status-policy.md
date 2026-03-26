# Response Envelope and HTTP Status Policy

Use this policy when defining API contracts to keep response shape and status code usage consistent.

## A) Standard response envelope

Success response:

```json
{
  "success": true,
  "data": {},
  "error": null
}
```

Error response:

```json
{
  "success": false,
  "data": null,
  "error": {
    "code": "SOME_ERROR_CODE",
    "message": "Human-readable message",
    "details": {}
  }
}
```

## B) Envelope rules

- Keep `success` boolean mandatory.
- `data` must be non-null only for success cases.
- `error` must be non-null only for error cases.
- `error.code` must be machine-readable and stable.
- `error.message` must be safe for clients.
- `error.details` is optional context, never include secrets.

## C) HTTP status policy

- 400: malformed request or invalid syntax/format.
- 401: unauthenticated request.
- 403: authenticated but forbidden.
- 404: resource not found.
- 409: conflict state.
- 422: semantic validation/business rule violation.
- 500: unhandled internal error.

## D) Consistency checks

- One scenario maps to one primary status and one error code.
- Keep backward compatibility for FE-handled error codes.
- Document any status or envelope change with FE impact notes.
- Ensure global exception handler returns envelope in all error cases.

## E) Test checklist

- Verify envelope shape for both success and error responses.
- Verify each major failure path returns expected status and error code.
- Verify sensitive fields are not leaked in `message` or `details`.
