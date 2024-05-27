from encryption_functions import Encrypt


def main():
    test = Encrypt('random.txt')

    test.set_password("admin")
    print("Test1:", test.hash_password())

    test.set_password("admin1")
    print("Test2:", test.hash_password())


main()
