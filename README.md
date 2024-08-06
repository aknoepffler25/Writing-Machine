Here's an updated README file incorporating all the necessary elements for your GitHub repository:

---

# Writing Machine Project

The Writing Machine is a Java application designed to control a set of stepper motors to write the message "Hello World". This project leverages the MQTT protocol to send commands to the motors.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Bill of Materials](#bill-of-materials)
- [CAD Model](#cad-model)
- [Assembly Instructions](#assembly-instructions)
- [Demo Video](#demo-video)
- [Lessons Learned](#lessons-learned)
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

## Bill of Materials

The full component Bill of Materials is included in the [BOM.xlsx](BOM.xlsx) file.

## CAD Model

The complete CAD model assembly file can be found in the [DESIGN.step](DESIGN.step) file.

## Assembly Instructions

Detailed pictures and explanations of the assembly process are provided in the [ASSEMBLY.pdf](ASSEMBLY.pdf) file.

## Demo Video

A clean video of the full operating system is available in the [DEMO.mp4](DEMO.mp4) file.

## Lessons Learned

During this project, we learned about the intricacies of controlling stepper motors via the MQTT protocol and how to integrate Java with hardware components. HexTech was extremely helpful in providing the necessary tools and support to successfully complete this project.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss your ideas.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This README provides a comprehensive overview of your project and includes sections for each required element. Be sure to add your files (BOM.xlsx, DESIGN.step, ASSEMBLY.pdf, DEMO.mp4) to the repository.
