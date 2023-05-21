import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kohsuke.github.GHIssueComment;
import org.mockito.Mockito;

class MockExampleTest {

  @Test
  void showMockProblem(){
    GHIssueComment ghIssueComment = Mockito.mock(GHIssueComment.class);
    Mockito.when(ghIssueComment.getId()).thenReturn(1L);

    Assertions.assertEquals(1L, ghIssueComment.getId());

  }
}
