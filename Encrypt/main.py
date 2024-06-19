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
    frame = Frame(window)
    frame.pack()

    # Frames to display different hashing options
    # SHA-1
    hashing_options_frame_sha1 = LabelFrame(
        frame, text="SHA-1 Hashing Algorithm")
    hashing_options_frame_sha1.grid(row=0, column=0)
    # SHA-2
    hashing_options_frame_sha2 = LabelFrame(
        frame, text="SHA-2 Hashing Algorithms")
    hashing_options_frame_sha2.grid(row=0, column=2)
    # SHA-3
    hashing_options_frame_sha3 = LabelFrame(
        frame, text="SHA-3 Hashing Algorithms")
    hashing_options_frame_sha3.grid(row=0, column=3)
    # MD5
    hashing_options_frame_md5 = LabelFrame(frame, text="MD5 Hashing Algorithm")
    hashing_options_frame_md5.grid(row=0, column=4)

    # Hashing option labels
    sha1_label = Label(hashing_options_frame_sha1, text="SHA-1")
    sha1_label.grid(row=0, column=0)

    # sha2_224_label =
    # sha2_256_label =
    # sha2_512_label =

    # sha3_224_label =
    # sha3_256_label =
    # sha3_384_label =
    # sha3_512_label =
    # sha3_shake128_label =
    # sha3_shake256_label =

    # md5_label =

    window.mainloop()


def main():
    render_password_hash_page()


main()
