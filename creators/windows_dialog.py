from .dialog import Dialog
from products.button import Button # Adjusted import path
from products.windows_button import WindowsButton # Adjusted import path

class WindowsDialog(Dialog):
    def create_button(self) -> Button:
        return WindowsButton()
