trait Output {
  def print(s: String) = Console.println(s)
}

class HelloWorld extends Output {
  def run() = print("Oh hai there!")
}
