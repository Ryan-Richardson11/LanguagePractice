from src.hash.hash_functions import Hash
from tkinter import *


def display_encryption_tab(frame):
    current = Hash()

    # Frames to display different hashing options
    hashing_options_frame_sym = LabelFrame(
        frame, text="Symmetric Algorithms")
    hashing_options_frame_sym.grid(
        row=0, column=0, padx=10, pady=10, sticky="nsew")

    hashing_options_frame_asym = LabelFrame(
        frame, text="Asymmetric Algorithms")
    hashing_options_frame_asym.grid(
        row=0, column=1, padx=10, pady=10, sticky="nsew")

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

    # Symmetric
    aes_radio = create_radio_button(
        hashing_options_frame_sym, "AES", "aes", 0, 0)
    aes_radio.grid(row=0, column=0, padx=10, pady=10)

    des_radio = create_radio_button(
        hashing_options_frame_sym, "DES", "des", 1, 0)
    des_radio.grid(row=1, column=0, padx=10, pady=10)

    des3_radio = create_radio_button(
        hashing_options_frame_sym, "3DES", "3des", 2, 0)
    des3_radio.grid(row=2, column=0, padx=10, pady=10)

    # Asymmetric
    rsa_radio = create_radio_button(
        hashing_options_frame_asym, "RSA", "rsa", 0, 0)
    rsa_radio.grid(row=0, column=0, padx=10, pady=10)

# ===========================================================================================================================================================
# End Build Hash Frame
# ===========================================================================================================================================================


# ===========================================================================================================================================================
# Start Hash Password
# ===========================================================================================================================================================

    # Password Entry
    password_label = Label(frame, text="Enter Password:")
    password_label.grid(row=1, column=0, padx=20, pady=10)
    password_entry = Entry(frame, width=40)
    password_entry.grid(row=1, column=0, columnspan=4, padx=10, pady=10)

    # Password Result Label
    password_result_label = Label(frame, text="Hashed Password: ")
    password_result_label.grid(row=3, column=0, columnspan=4, padx=10, pady=10)

    def hash_password():
        password = password_entry.get()
        algorithm = selected_algorithm.get()
        if algorithm == "none":
            file_result_label.config(text="Please select a hashing algorithm")
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

        password_result_label.config(text=f"Hashed Password: {hashed}")

    # Password Hash Button
    password_hash_button = Button(
        frame, text="Hash Password", command=hash_password)
    password_hash_button.grid(row=6, column=0, columnspan=2, padx=10, pady=10)

# ===========================================================================================================================================================
# End Hash Password
# ===========================================================================================================================================================


# ===========================================================================================================================================================
# Start Hash File
# ===========================================================================================================================================================

    # File Entry
    file_label = Label(frame, text="Enter File Path:")
    file_label.grid(row=2, column=0, padx=20, pady=10)
    file_entry = Entry(frame, width=40)
    file_entry.grid(row=2, column=0, columnspan=4, padx=10, pady=10)

    # File Result Label
    file_result_label = Label(frame, text="File Hash Digest: ")
    file_result_label.grid(row=4, column=0, columnspan=4, padx=10, pady=10)

    def hash_file():
        file_path = file_entry.get()
        algorithm = selected_algorithm.get()
        if algorithm == "none":
            file_result_label.config(text="Please select a hashing algorithm")
            return

        hashed = None
        if algorithm == "sha1":
            hashed = current.hash_file_SHA1(file_path)
        # elif algorithm == "sha2_224":
        #     hashed = current.hash_password_SHA2_224(password)
        # elif algorithm == "sha2_256":
        #     hashed = current.hash_password_SHA2_256(password)
        # elif algorithm == "sha2_512":
        #     hashed = current.hash_password_SHA2_512(password)
        # elif algorithm == "sha3_224":
        #     hashed = current.hash_password_SHA3_224(password)
        # elif algorithm == "sha3_256":
        #     hashed = current.hash_password_SHA3_256(password)
        # elif algorithm == "sha3_384":
        #     hashed = current.hash_password_SHA3_384(password)
        # elif algorithm == "sha3_512":
        #     hashed = current.hash_password_SHA3_512(password)
        # elif algorithm == "sha3_shake128":
        #     hashed = current.hash_password_SHA3_shake128(password)
        # elif algorithm == "sha3_shake256":
        #     hashed = current.hash_password_SHA3_shake256(password)
        # elif algorithm == "md5":
        #     hashed = current.hash_password_md5(password)

        file_result_label.config(text=f"File Hash Digest: {hashed}")

    # File Hash Button
    file_hash_button = Button(frame, text="Hash File", command=hash_file)
    file_hash_button.grid(row=6, column=0, columnspan=4, padx=10, pady=10)

# ===========================================================================================================================================================
# End Hash File
# ===========================================================================================================================================================


# ===========================================================================================================================================================
# Start Refresh App
# ===========================================================================================================================================================

# ===========================================================================================================================================================
# End Refresh App
# ===========================================================================================================================================================
