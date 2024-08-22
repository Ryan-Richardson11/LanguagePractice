from src.hash.hash_functions import Hash
from tkinter import *


def display_encryption_tab(frame):
    current = Hash()

    # Frames to display different hashing options
    hashing_options_frame_sha1 = LabelFrame(
        frame, text="SHA-1 Hashing Algorithm")
    hashing_options_frame_sha1.grid(
        row=0, column=0, padx=10, pady=10, sticky="nsew")

    hashing_options_frame_sha2 = LabelFrame(
        frame, text="SHA-2 Hashing Algorithms")
    hashing_options_frame_sha2.grid(
        row=0, column=1, padx=10, pady=10, sticky="nsew")

    hashing_options_frame_sha3 = LabelFrame(
        frame, text="SHA-3 Hashing Algorithms")
    hashing_options_frame_sha3.grid(
        row=0, column=2, padx=10, pady=10, sticky="nsew")

    hashing_options_frame_md5 = LabelFrame(frame, text="MD5 Hashing Algorithm")
    hashing_options_frame_md5.grid(
        row=0, column=3, padx=10, pady=10, sticky="nsew")

    # Configure rows and columns to be equally spaced
    frame.columnconfigure(0, weight=1)
    frame.columnconfigure(1, weight=1)
    frame.columnconfigure(2, weight=1)
    frame.columnconfigure(3, weight=1)
    frame.rowconfigure(0, weight=1)

    # Hashing option radio buttons
    selected_algorithm = StringVar(value="none")

    def create_radio_button(frame, text, value, row, column):
        return Radiobutton(frame, text=text, variable=selected_algorithm, value=value)

    # SHA-1
    sha1_radio = create_radio_button(
        hashing_options_frame_sha1, "SHA-1", "sha1", 0, 0)
    sha1_radio.grid(row=0, column=0, padx=10, pady=10)

    # SHA-2
    sha2_224_radio = create_radio_button(
        hashing_options_frame_sha2, "SHA-2 (224)", "sha2_224", 0, 0)
    sha2_224_radio.grid(row=0, column=0, padx=10, pady=10)
    sha2_256_radio = create_radio_button(
        hashing_options_frame_sha2, "SHA-2 (256)", "sha2_256", 1, 0)
    sha2_256_radio.grid(row=1, column=0, padx=10, pady=10)
    sha2_512_radio = create_radio_button(
        hashing_options_frame_sha2, "SHA-2 (512)", "sha2_512", 2, 0)
    sha2_512_radio.grid(row=2, column=0, padx=10, pady=10)

    # SHA-3
    sha3_224_radio = create_radio_button(
        hashing_options_frame_sha3, "SHA-3 (224)", "sha3_224", 0, 0)
    sha3_224_radio.grid(row=0, column=0, padx=10, pady=10)
    sha3_256_radio = create_radio_button(
        hashing_options_frame_sha3, "SHA-3 (256)", "sha3_256", 1, 0)
    sha3_256_radio.grid(row=1, column=0, padx=10, pady=10)
    sha3_384_radio = create_radio_button(
        hashing_options_frame_sha3, "SHA-3 (384)", "sha3_384", 2, 0)
    sha3_384_radio.grid(row=2, column=0, padx=10, pady=10)
    sha3_512_radio = create_radio_button(
        hashing_options_frame_sha3, "SHA-3 (512)", "sha3_512", 3, 0)
    sha3_512_radio.grid(row=3, column=0, padx=10, pady=10)
    sha3_shake128_radio = create_radio_button(
        hashing_options_frame_sha3, "SHA-3 (Shake-128)", "sha3_shake128", 4, 0)
    sha3_shake128_radio.grid(row=4, column=0, padx=10, pady=10)
    sha3_shake256_radio = create_radio_button(
        hashing_options_frame_sha3, "SHA-3 (Shake-256)", "sha3_shake256", 5, 0)
    sha3_shake256_radio.grid(row=5, column=0, padx=10, pady=10)

    # MD5
    md5_radio = create_radio_button(
        hashing_options_frame_md5, "MD5", "md5", 0, 0)
    md5_radio.grid(row=0, column=0, padx=10, pady=10)

    # Password Entry
    password_label = Label(frame, text="Enter Password:")
    password_label.grid(row=1, column=0, padx=20, pady=10)
    password_entry = Entry(frame, width=40)
    password_entry.grid(row=1, column=0, columnspan=4, padx=10, pady=10)

    # Result Label
    result_label = Label(frame, text="Hashed Password: ")
    result_label.grid(row=2, column=0, columnspan=4, padx=10, pady=10)

    # Hash Password Button
    def hash_password():
        password = password_entry.get()
        algorithm = selected_algorithm.get()
        if algorithm == "none":
            result_label.config(text="Please select a hashing algorithm")
            return

        hashed = None
        if algorithm == "sha1":
            hashed = current.hash_password_SHA1(password)
        elif algorithm == "sha2_224":
            hashed = current.hash_password_SHA2_224(password)
        elif algorithm == "sha2_256":
            hashed = current.hash_password_SHA2_256(password)
        elif algorithm == "sha2_512":
            hashed = current.hash_password_SHA2_512(password)
        elif algorithm == "sha3_224":
            hashed = current.hash_password_SHA3_224(password)
        elif algorithm == "sha3_256":
            hashed = current.hash_password_SHA3_256(password)
        elif algorithm == "sha3_384":
            hashed = current.hash_password_SHA3_384(password)
        elif algorithm == "sha3_512":
            hashed = current.hash_password_SHA3_512(password)
        elif algorithm == "sha3_shake128":
            hashed = current.hash_password_SHA3_shake128(password)
        elif algorithm == "sha3_shake256":
            hashed = current.hash_password_SHA3_shake256(password)
        elif algorithm == "md5":
            hashed = current.hash_password_md5(password)

        result_label.config(text=f"Hashed Password: {hashed}")

    hash_button = Button(frame, text="Hash Password", command=hash_password)
    hash_button.grid(row=3, column=0, columnspan=4, padx=10, pady=10)
