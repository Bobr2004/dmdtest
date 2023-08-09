def wirte_func_to_file(path):
    def obamna (func):
        def handler(*args):
            with open(path,"w") as fout:
                fout.write(func(*args))
        return handler
    return obamna



def to_power(power):
    def handler(number):
        return pow(number,power)
    return handler


if __name__ == "__main__":
    pass