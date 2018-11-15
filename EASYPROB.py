def solve(n):
  result = ''
  exponent = 0
  while n != 0:
    if n % 2 != 0:
      if result:
        result = '+' + result

      if exponent == 0:
        result = '(0)' + result
      elif exponent != 1:
        result = '({})'.format(solve(exponent)) + result
      result = '2' + result

    n //= 2
    exponent += 1
  return result


for n in [137, 1315, 73, 136, 255, 1384, 16385]:
  print('{}={}'.format(n, solve(n)))
