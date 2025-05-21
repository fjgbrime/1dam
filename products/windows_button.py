from .button import Button

class WindowsButton(Button):
    def render(self):
        print("Render a button in Windows style")
        self.on_click(lambda: print("WindowsButton says: Hello World!"))

    def on_click(self, f):
        # Simulate a click event
        f()
