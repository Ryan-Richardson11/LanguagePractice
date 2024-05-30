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
    frame = ttk.Frame(window, padding=250)
    frame.grid()
    password = ttk.Entry(frame, text="Enter Password").grid(column=0, row=0)
    test.set_password(password)
    ttk.Button(frame, text="Hash password", command=test.hash_password()).grid(
        column=1, row=0)
    window.mainloop()


main()
