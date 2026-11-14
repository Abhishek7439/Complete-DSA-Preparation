class Solution(object):
    def toggleLightBulbs(self, bulbs):
        """
        :type bulbs: List[int]
        :rtype: List[int]
        """
        on = set()
        for b in bulbs:
            if b in on:
                on.remove(b)
            else:
                on.add(b)
                
        return sorted(on)