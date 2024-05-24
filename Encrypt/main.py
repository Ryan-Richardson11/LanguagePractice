from encryption_functions import Encrypt


def main():
    test = Encrypt('random.txt')
    test.set_password("admin")
    print(test.hash_password())


main()
