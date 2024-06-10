from Crypto.Hash import HMAC, SHA256
import hashlib


class Hash:

    def __init__(self):
        pass

    # def set_password(self, new_password):
    #     self.password = new_password

    def hash_password(self, password):
        hashed = hashlib.sha256(
            f"{password}".encode(), usedforsecurity=True).hexdigest()
        return hashed
