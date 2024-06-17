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

    def hash_password_512(self, password):
        hashed = hashlib.sha512(
            f"{password}".encode(), usedforsecurity=True).hexdigest()
        print(hashed)
        return hashed
