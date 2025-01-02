from src.hash.hash_tab import display_hash_tab
from src.encryption.encryption_tab import display_encryption_tab
from tkinter import *
from tkinter import ttk
import src.utils as utils


def render_app():
    window = Tk()
    window.title("Password Hashing")
    window.geometry('1000x500')

    # Creates a Notebook widget
    notebook = ttk.Notebook(window)
    notebook.pack(expand=True, fill=BOTH)

    password_hash_tab = utils.add_tab(notebook, "Hash Passwords")
    file_hash_tab = utils.add_tab(notebook, "Encryption Keys")

    display_hash_tab(password_hash_tab)
    display_encryption_tab(file_hash_tab)

    window.mainloop()
