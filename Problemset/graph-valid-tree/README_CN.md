
| [English](README.md) | 简体中文 |

# [261. 以图判树](https://leetcode-cn.com/problems/graph-valid-tree/)

## 题目描述

<p>给定从 <code>0</code> 到 <code>n-1</code>&nbsp;标号的&nbsp;<code>n</code> 个结点，和一个无向边列表（每条边以结点对来表示），请编写一个函数用来判断这些边是否能够形成一个合法有效的树结构。</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入:</strong> <code>n = 5</code>, 边列表 edges<code> = [[0,1], [0,2], [0,3], [1,4]]</code>
<strong>输出:</strong> true</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入:</strong> <code>n = 5, </code>边列表 edges<code> = [[0,1], [1,2], [2,3], [1,3], [1,4]]</code>
<strong>输出:</strong> false</pre>

<p><strong>注意：</strong>你可以假定边列表 <code>edges</code> 中不会出现重复的边。由于所有的边是无向边，边&nbsp;<code>[0,1]</code>&nbsp;和边 <code>[1,0]</code>&nbsp;是相同的，因此不会同时出现在边列表 <code>edges</code> 中。</p>


## 相关话题

- [深度优先搜索](https://leetcode-cn.com/tag/depth-first-search)
- [广度优先搜索](https://leetcode-cn.com/tag/breadth-first-search)
- [并查集](https://leetcode-cn.com/tag/union-find)
- [图](https://leetcode-cn.com/tag/graph)

## 相似题目

- [课程表](../course-schedule/README.md)
- [无向图中连通分量的数目](../number-of-connected-components-in-an-undirected-graph/README.md)
