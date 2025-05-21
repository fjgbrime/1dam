from creators.dialog import Dialog # Adjusted import path
from creators.windows_dialog import WindowsDialog # Adjusted import path
from creators.web_dialog import WebDialog # Adjusted import path

class Application:
    def __init__(self):
        self.dialog = None

    def initialize(self, config_os):
        if config_os == "Windows":
            self.dialog = WindowsDialog()
        elif config_os == "Web":
            self.dialog = WebDialog()
        else:
            raise Exception("Error! Unknown operating system.")

    def main(self, config_os):
        self.initialize(config_os)
        self.dialog.render()

if __name__ == "__main__":
    # Example Usage
    app_windows = Application()
    print("Client: Testing client code with Windows configuration...")
    app_windows.main("Windows")

    print("\nClient: Testing client code with Web configuration...")
    app_web = Application()
    app_web.main("Web")
