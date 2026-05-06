import os

class FileManager:
    FILE_PATH = "data/output.txt"

    @staticmethod
    def save_to_file(data: str):

        os.makedirs(os.path.dirname(FileManager.FILE_PATH), exist_ok=True)
        

        with open(FileManager.FILE_PATH, "a", encoding="utf-8") as writer:
            writer.write(data + "\n")

    @staticmethod
    def clear_file():

        os.makedirs(os.path.dirname(FileManager.FILE_PATH), exist_ok=True)
        
        # 'w' sobreescribe el archivo, dejándolo vacío
        with open(FileManager.FILE_PATH, "w", encoding="utf-8") as writer:
            writer.write("")
            