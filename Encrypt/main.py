from encryption_functions import Encrypt
from hash_functions import Hash
from tkinter import *
from tkinter import ttk


# def render_password_hash_page():
#     current = Hash()
#     window = Tk()
#     window.title("Password Hashing")
#     window.geometry('600x400')

#     password_entry = Entry(window, width=30)
#     password_entry.pack()

#     hashed_output = Label(window, text="")
#     hashed_output.pack()

#     def hash_password_btn():
#         password = password_entry.get()
#         hashed = current.hash_password(password)
#         hashed_output.config(text=hashed)

#     btn = Button(window, text="Hash password",
#                  command=hash_password_btn)
#     btn.pack()

#     window.mainloop()

def render_password_hash_page():
    current = Hash()
    window = Tk()
    window.title("Password Hashing")
    window.geometry('800x400')  # Increased window size for better spacing
    frame = Frame(window)
    frame.pack(expand=True, fill=BOTH)

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

    # Hashing option labels
    sha1_label = Label(hashing_options_frame_sha1, text="SHA-1")
    sha1_label.grid(row=0, column=0, padx=10, pady=10)

    sha2_224_label = Label(hashing_options_frame_sha2, text="SHA-2 (224)")
    sha2_224_label.grid(row=0, column=0, padx=10, pady=10)

    sha2_256_label = Label(hashing_options_frame_sha2, text="SHA-2 (256)")
    sha2_256_label.grid(row=1, column=0, padx=10, pady=10)

    sha2_512_label = Label(hashing_options_frame_sha2, text="SHA-2 (512)")
    sha2_512_label.grid(row=2, column=0, padx=10, pady=10)

    sha3_224_label = Label(hashing_options_frame_sha3, text="SHA-3 (224)")
    sha3_224_label.grid(row=0, column=0, padx=10, pady=10)

    sha3_256_label = Label(hashing_options_frame_sha3, text="SHA-3 (256)")
    sha3_256_label.grid(row=1, column=0, padx=10, pady=10)

    sha3_384_label = Label(hashing_options_frame_sha3, text="SHA-3 (384)")
    sha3_384_label.grid(row=2, column=0, padx=10, pady=10)

    sha3_512_label = Label(hashing_options_frame_sha3, text="SHA-3 (512)")
    sha3_512_label.grid(row=3, column=0, padx=10, pady=10)

    sha3_shake128_label = Label(
        hashing_options_frame_sha3, text="SHA-3 (Shake-128)")
    sha3_shake128_label.grid(row=4, column=0, padx=10, pady=10)

    sha3_shake256_label = Label(
        hashing_options_frame_sha3, text="SHA-3 (Shake-256)")
    sha3_shake256_label.grid(row=5, column=0, padx=10, pady=10)

    md5_label = Label(hashing_options_frame_md5, text="MD5")
    md5_label.grid(row=0, column=0, padx=10, pady=10)

    window.mainloop()


def main():
    # Renders initial page for choosing hashes and inputing password
    render_password_hash_page()


main()
