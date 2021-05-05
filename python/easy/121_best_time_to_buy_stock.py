from typing import List


def maxProfit(prices: List[int]) -> int:
    current_lowest = prices[0]
    current_profit = 0
    for price in prices:
        if price < current_lowest:
            current_lowest = price
        current_profit = max(current_profit, price - current_lowest)
    return current_profit


res = maxProfit([7, 1, 5, 3, 6, 4])
print(res)
