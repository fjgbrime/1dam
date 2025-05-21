from .dialog import Dialog
from products.button import Button # Adjusted import path
from products.html_button import HTMLButton # Adjusted import path

class WebDialog(Dialog):
    def create_button(self) -> Button:
        return HTMLButton()
