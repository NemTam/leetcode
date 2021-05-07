from collections import deque


class LRUCache:

    def __init__(self, capacity: int):
        self.d = {}
        self.queue = deque(maxlen=capacity)

    def get(self, key: int) -> int:
        if key in self.d:
            self.queue.remove(key)
            self.queue.append(key)
            return self.d[key]
        else:
            # self.queue.append(key)
            return -1

    def put(self, key: int, value: int) -> None:
        if key in self.d:
            self.d[key] = value
            self.queue.remove(key)
            self.queue.append(key)
        else:
            self.d[key] = value
            if len(self.queue) == self.queue.maxlen:
                del self.d[self.queue.popleft()]
                self.queue.append(key)
            else:
                self.queue.append(key)


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)

lru_cache = LRUCache(2)
lru_cache.put(1, 1)
lru_cache.put(2, 2)
res = lru_cache.get(1)
print(res)
lru_cache.put(3, 3)
res = lru_cache.get(2)
print(res)
lru_cache.put(4, 4)
print(lru_cache.get(1))
print(lru_cache.get(3))
print(lru_cache.get(4))
