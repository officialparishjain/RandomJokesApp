# Project Name
Random Jokes Application

# Frameworks and Language Used
**Spring Boot** 2.1.0
**Java** 17.0
**Maven** 3.8.1

# Jokes API

This is a simple API that allows you to save and retrieve jokes.

## Endpoints

### Save a Joke

- Endpoint: `POST /jokes`
- Request Body: A string representing the joke
- Response: "Joke Saved"

This endpoint saves a joke to the API. The joke should be provided as a string in the request body.

### Get a Random Joke

- Endpoint: `GET /jokes`
- Response: A randomly selected joke from the collection of jokes

This endpoint retrieves a random joke from the collection of jokes stored in the API. Each time you make a request to this endpoint, a different joke will be returned.

## Usage

1. Start the Jokes API server.
2. Send a POST request to the `/jokes` endpoint with a joke in the request body to save a joke.
3. Send a GET request to the `/jokes` endpoint to retrieve a random joke.

Feel free to contribute by adding more jokes to the collection!




