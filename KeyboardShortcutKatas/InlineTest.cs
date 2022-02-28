using Xunit;

namespace KeyboardShortcutKatas
{
    public class InlineTest
    {
        [Fact]
        public void TestPracticeMethod()
        {
            var r = new Inline().Practice();
            Assert.Equal(42, r);
        }
    }
}
