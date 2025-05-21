from abc import ABC, abstractmethod

class Button(ABC):
    @abstractmethod
    def render(self):
        pass

    @abstractmethod
    def on_click(self, f):
        pass
