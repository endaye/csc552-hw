package ajeffrey.teaching.size.event;

import java.io.InputStream;

/**
 * A factory for size response parsers.
 * @author Alan Jeffrey
 * @version 1.0.1
 */
public interface SizeResponseParserFactory {

    /**
     * Build a new size response parser.
     * @param in the input stream to read from
     * @return a new size response parser.
     */
    public SizeResponseParser build (InputStream in);

}
