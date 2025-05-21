from .button import Button

class HTMLButton(Button):
    def render(self):
        print("<button>Test Button</button>")
        self.on_click(lambda: print("HTMLButton says: Hello World!"))

    def on_click(self, f):
        # Simulate a click event
        f()
