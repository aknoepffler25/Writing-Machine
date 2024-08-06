# Writing Machine

The Writing Machine is a Java application that controls a set of stepper motors to write the message "Hello World". The application uses MQTT protocol to send commands to the motors.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/your-repository-name.git
   cd your-repository-name
   ```

2. **Ensure you have Java installed:**
   - You can download Java from [here](https://www.oracle.com/java/technologies/javase-downloads.html).

3. **Compile the Java files:**
   ```bash
   javac -d bin src/package-alex/*.java
   ```

4. **Run the application:**
   ```bash
   java -cp bin package.alex.WritingMachine
   ```

## Usage

The Writing Machine application sends MQTT commands to control stepper motors and create letters. The main method initializes the current settings and runs the `constant` method to start writing.

## Code Overview

- **Main Class:** `WritingMachine`
- **Broker:** `ws://mqtt.hextronics.cloud:8083/mqtt`
- **Topic:** `hextech/hextech-alex/commands`
- **Username:** `hextech-alex`
- **Password:** `alex`

### Methods

- **initializeCurrent():** Sets the initial current for the stepper motors.
- **pushBack():** Sends a command to move the steppers back.
- **constant():** Sends a constant move command to the steppers.
- **letters(String letter):** Sends commands to create specific letters (H, E, L, O, W, R, D).

Example of writing "HELLO WORLD":

1. Call `letters("H")`
2. Call `letters("E")`
3. Call `letters("L")`
4. Call `letters("L")`
5. Call `letters("O")`
6. Call `letters("W")`
7. Call `letters("O")`
8. Call `letters("R")`
9. Call `letters("L")`
10. Call `letters("D")`

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss your ideas.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

You can customize this README further based on your specific needs and preferences.
