# API Endpoint Catalog Template

Use this template to produce a consistent endpoint catalog for design review and FE handoff.

## 1) Endpoint matrix template

| Feature | Endpoint Name | Method | Path          | Auth | Request DTO       | Response DTO | Success Status | Error Codes                         | Notes |
| ------- | ------------- | ------ | ------------- | ---- | ----------------- | ------------ | -------------- | ----------------------------------- | ----- |
| Decks   | Create Deck   | POST   | /api/v1/decks | USER | CreateDeckRequest | DeckResponse | 201            | DECK_NAME_CONFLICT, INVALID_REQUEST |       |

## 2) Detailed endpoint card template

### <Endpoint Name>

- Feature: <Feature>
- Method: <HTTP Method>
- Path: <API Path>
- Auth: <PUBLIC | USER | ADMIN>
- Query Params: <none | list>
- Path Params: <none | list>
- Request DTO: <ClassName>
- Response DTO: <ClassName>
- Success Status: <200|201|204>
- Error Codes: <comma-separated>

Example request JSON:

```json
{
  "example": "request"
}
```

Example success JSON:

```json
{
  "success": true,
  "data": {
    "example": "response"
  },
  "error": null
}
```

Example error JSON:

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

## 3) Catalog completion checklist

- [ ] Every FE-called endpoint appears in the matrix.
- [ ] Paths and methods match FE observations.
- [ ] DTO names match backend contract proposal.
- [ ] Success status is explicitly defined for each endpoint.
- [ ] Error codes align with exception mapping checklist.
- [ ] Example JSON exists for request/success/error where applicable.
