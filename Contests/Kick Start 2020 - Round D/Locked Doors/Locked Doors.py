from sys import stdin, stdout


def bfsolve(s, k, D):
    right = s - 1
    left = s - 2
    n = len(D)
    while k > 1:
        # print(k, s, left, right)
        if right >= n:
            s = left + 1
            left -= 1
        elif left < 0:
            right += 1
            s = right + 1
        elif D[right] < D[left]:
            right += 1
            s = right + 1
        else:
            s = left + 1
            left -= 1

        k -= 1

    return s


no_of_test_cases = int(stdin.readline())

for t in range(1, no_of_test_cases + 1):
    n, q = map(int, stdin.readline().split())
    D = list(map(int, stdin.readline().split()))

    ans = []

    for _ in range(q):
        s, k = map(int, stdin.readline().split())
        ans.append(bfsolve(s, k, D))

    stdout.write('Case #' + str(t) + ': ' + ' '.join(map(str, ans)) + '\n')
