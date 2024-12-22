using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        if (strs == null || strs.Length == 0) return new List<IList<string>>();

        // Dictionary to store groups of anagrams
        var anagramGroups = new Dictionary<string, List<string>>();

        foreach (var str in strs) {
            // Sort the characters of the string to form the key
            char[] charArray = str.ToCharArray();
            Array.Sort(charArray);
            string key = new string(charArray);

            // Add the string to the corresponding anagram group
            if (!anagramGroups.ContainsKey(key)) {
                anagramGroups[key] = new List<string>();
            }
            anagramGroups[key].Add(str);
        }

        // Convert dictionary values to a list of lists
        return anagramGroups.Values.ToList<IList<string>>();
    }
}


