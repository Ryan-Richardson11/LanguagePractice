from Crypto.Hash import HMAC, SHA256
import hashlib


class Hash:

    def __init__(self, password=None):
        self.password = password

    def set_password(self, new_password):
        self.password = new_password

    def hash_password(self):
        hashed = hashlib.sha256(
            f"{self.password}".encode(), usedforsecurity=True).hexdigest()
        return hashed
