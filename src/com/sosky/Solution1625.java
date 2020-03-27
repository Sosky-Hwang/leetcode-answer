package com.sosky;

import java.util.HashMap;
import java.util.Map;

/**
 * 设计和构建一个“最近最少使用”缓存，该缓存会删除最近最少使用的项目。缓存应该从键映射到值(允许你插入和检索特定键对应的值)，并在初始化时指定最大容量。当缓存被填满时，它应该删除最近最少使用的项目。
 * <p>
 * 它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 * <p>
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 */
public class Solution1625 {
    public static void main(String[] args) throws InterruptedException {
        LRUCache cache = new LRUCache(2 /* 缓存容量 */);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));// 返回  1
        cache.put(3, 3);   // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));      // 返回 -1 (未找到)
        cache.put(4, 4);   // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));      // 返回 -1 (未找到)
        System.out.println(cache.get(3));     // 返回  3
        System.out.println(cache.get(4));     // 返回  4
    }
}

class LRUCache {
    private int capacity;
    private int usedCapacity;
    private Map<Integer, Integer> cache;
    private Map<Integer, Long> cacheUsed;

    LRUCache(int capacity) {
        cache = new HashMap<>();
        cacheUsed = new HashMap<>();
        this.capacity = capacity;
        usedCapacity = 0;
    }

    public int get(int key) {
        int result = cache.getOrDefault(key, -1);
        if (result > -1) {
            cacheUsed.put(key, System.currentTimeMillis());
        }
        return result;
    }

    void put(int key, int value) {
        Integer target = cache.get(key);
        if (target != null) {
            cache.put(key, value);
            cacheUsed.put(key, System.currentTimeMillis());
        } else {
            if (usedCapacity == capacity) {
                int idx = 0;
                long idxUsed = Long.MAX_VALUE;
                for (Integer usedKey : cacheUsed.keySet()) {
                    if (cacheUsed.get(usedKey) < idxUsed) {
                        idx = usedKey;
                        idxUsed = cacheUsed.get(usedKey);
                    }
                }
                cache.remove(idx);
                cacheUsed.remove(idx);
                usedCapacity--;
            }
            cache.put(key, value);
            cacheUsed.put(key, System.currentTimeMillis());
            usedCapacity++;
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
