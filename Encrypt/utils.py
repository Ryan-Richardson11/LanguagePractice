from tkinter import *
from tkinter import ttk


def add_tab(notebook, tab_name):
    new_tab = Frame(notebook)
    notebook.add(new_tab, text=f"{tab_name}")
    return new_tab
