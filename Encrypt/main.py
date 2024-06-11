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
    password = password_entry.get()
    hashed = current.hash_password(password)

    Button(window, text="Hash password",
           command=hashed).pack()

    window.mainloop()


def main():
    render_password_hash()


main()
