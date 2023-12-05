# Duplicate Lines

Instead of copying and pasting code with two separate keyboard shortcuts, you can also duplicate one or more lines. This is often convenient for example when creating parameterized tests.

Aim to create this additional test case in ParrotTest.cs. Begin with just one line of InlineData

    [InlineData(0, 0, false, 0)]

Duplicate it and edit it as needed to get 8 test cases. Don't forget you can duplicate two or four lines at a time, and use multiple cursors to edit them.

Aim for this:

        [Theory]
        [InlineData(0, 0, false, 0)]
        [InlineData(0, 1, false, 12.0)]
        [InlineData(1, 0, false, 0)]
        [InlineData(1, 1, false, 12.0)]
        [InlineData(0, 0, true, 0)]
        [InlineData(0, 1, true, 0)]
        [InlineData(1, 0, true, 0)]
        [InlineData(1, 1, true, 0)]
        public void GetSpeedOfNorwegianParrotWithData(int numberOfCoconuts, int voltage, bool isNailed, float expected)
        {
            var parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
            Assert.Equal(expected, parrot.GetSpeed());
        }

Do the same for AfricanParrots.