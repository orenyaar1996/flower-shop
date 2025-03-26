
## Flower Delivery Store
A simple Java application simulating an order and delivery management system for a flower and plant store. Orders are queued and grouped by city for efficient delivery.

## Getting Started
This project is built using Java and is designed to run in Visual Studio Code.

To run the app, open DeliveryManager.java and run the main method. The system will simulate adding multiple orders and process deliveries periodically.

## Folder Structure
- src/ – Source files:
  - Item.java: Abstract class representing a purchasable item.
  - Flower.java, Plant.java: Concrete item types.
  - Order.java: Represents a customer order.
  - Store.java: Handles order management and delivery logic.
  - DeliveryManager.java: Entry point of the application.

- lib/ – External dependencies (none required for this project).
- bin/ – Compiled output files (created automatically).

## Features
- Supports two item types: Flowers and Plants.
- Manages orders by city to optimize delivery.
- Scheduled delivery creation every 10 seconds.

## Notes
- Delivery size is limited to a maximum number of items per delivery run.
- Items are priced differently based on type and attributes (e.g., pot included for plants).
