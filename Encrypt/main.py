from encryption_functions import Encrypt
from hash_functions import Hash
from tkinter import *
from tkinter import ttk


def render_password_hash():
    current = Hash()
    window = Tk()
    frame = ttk.Frame(window, padding=250)
    frame.grid()
    password = ttk.Entry(frame, text="Enter Password").grid(column=0, row=0)
    ttk.Button(frame, text="Hash password", command=current.hash_password(password)).grid(
        column=1, row=0)
    window.mainloop()


def main():
    render_password_hash()


main()
