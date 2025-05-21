from abc import ABC, abstractmethod
from products.button import Button # Adjusted import path

class Dialog(ABC):
    @abstractmethod
    def create_button(self) -> Button:
        pass

    def render(self):
        ok_button = self.create_button()
        ok_button.render()
