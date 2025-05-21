# Factory Method Design Pattern Example

This example demonstrates the Factory Method design pattern.

## Structure

The example is structured as follows:

-   `products/`: Contains the product interface (`button.py`) and concrete product classes (`html_button.py`, `windows_button.py`).
    -   `button.py`: Defines the `Button` interface with `render()` and `on_click()` methods.
    -   `html_button.py`: Implements `HTMLButton` that renders an HTML-style button.
    -   `windows_button.py`: Implements `WindowsButton` that renders a Windows-style button.
-   `creators/`: Contains the creator class (`dialog.py`) and concrete creator classes (`web_dialog.py`, `windows_dialog.py`).
    -   `dialog.py`: Defines the abstract `Dialog` class with the factory method `create_button()`. It also has a `render()` method that uses the button created by the factory method.
    -   `web_dialog.py`: Implements `WebDialog` which overrides `create_button()` to return an `HTMLButton`.
    -   `windows_dialog.py`: Implements `WindowsDialog` which overrides `create_button()` to return a `WindowsButton`.
-   `application.py`: Contains the client code that uses the factory to create and render buttons depending on a configuration.

## How to Run

To run the example, execute the `application.py` file:

```bash
python application.py
```

This will output:

```
Client: Testing client code with Windows configuration...
Render a button in Windows style
WindowsButton says: Hello World!

Client: Testing client code with Web configuration...
<button>Test Button</button>
HTMLButton says: Hello World!
```
