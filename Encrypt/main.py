from encryption_functions import Encrypt
from hash_functions import Hash
from tkinter import *
from tkinter import ttk


def render_password_hash():
    current = Hash()
    window = Tk()
    window.geometry('600x400')

    password_entry = Entry(window, width=30)
    password_entry.pack()

    hashed_output = Label(window, text="")
    hashed_output.pack()

    def hash_password_btn():
        password = password_entry.get()
        hashed = current.hash_password(password)
        hashed_output.config(text=hashed)

    btn = Button(window, text="Hash password",
                 command=hash_password_btn)
    btn.pack()

    window.mainloop()


def main():
    render_password_hash()


main()
