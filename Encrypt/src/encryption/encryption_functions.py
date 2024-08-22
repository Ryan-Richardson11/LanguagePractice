from Crypto.Cipher import AES
from Crypto.Hash import HMAC, SHA256
from Crypto.Random import get_random_bytes
import os
import hashlib


class Encrypt:
    def __init__(self, file_name, file_path=None, dir=None):
        self.file_name = file_name
        self.file_path = file_path
        self.dir = dir

    def encrypt_file(self, file_name):
        aes_key = get_random_bytes(16)
        encryption = AES.new(aes_key, AES.MODE_CTR)

        with open(f'{file_name}', "w") as inputed_file:
            for line in inputed_file:
                encryption.encrypt(line)
        os.open(file_name)

    def encrypt_dir():
        pass

    def cryptographic_erase():
        pass
