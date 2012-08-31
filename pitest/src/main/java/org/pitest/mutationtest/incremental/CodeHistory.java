package org.pitest.mutationtest.incremental;

import org.pitest.classinfo.ClassName;
import org.pitest.functional.Option;
import org.pitest.mutationtest.engine.MutationIdentifier;
import org.pitest.mutationtest.execute.MutationStatusTestPair;

public interface CodeHistory {

  Option<MutationStatusTestPair> getPreviousResult(final MutationIdentifier id);

  boolean hasClassChanged(ClassName className);

}