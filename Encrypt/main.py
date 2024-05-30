from encryption_functions import Encrypt
from tkinter import *
from tkinter import ttk


def main():
    test = Encrypt('random.txt')

    test.set_password("admin")
    print("Test1:", test.hash_password())

    test.set_password("admin1")
    print("Test2:", test.hash_password())

    window = Tk()
    frame = ttk.Frame(window, padding=10)
    frame.grid()
    ttk.Label(frame, text="Hello World!").grid(column=0, row=0)
    ttk.Button(frame, text="Quit", command=window.destroy).grid(
        column=1, row=0)
    window.mainloop()


main()
