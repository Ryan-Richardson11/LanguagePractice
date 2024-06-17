from Crypto.Hash import HMAC, SHA256
import hashlib
from tkinter import *
from tkinter import ttk


class Hash:

    def __init__(self):
        pass

    def hash_password(self, password):
        hashed = hashlib.sha256(
            f"{password}".encode(), usedforsecurity=True).hexdigest()
        print(hashed)
        return hashed

    def render_password_hash(self):
        current = Hash()
        window = Tk()
        window.geometry('600x400')

        password_entry = Entry(window, width=30)
        password_entry.pack()
        password = password_entry.get()
        hashed = current.hash_password(password)

        Button(window, text="Hash password",
               command=hashed).pack()

        window.mainloop()
