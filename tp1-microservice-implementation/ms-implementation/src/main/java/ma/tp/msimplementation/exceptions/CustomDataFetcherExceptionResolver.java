package ma.tp.msimplementation.exceptions;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;


@Component
public class CustomDataFetcherExceptionResolver extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        String message = (ex instanceof ResponseStatusException rse)
                ? rse.getReason()
                : ex.getMessage();

        return GraphqlErrorBuilder.newError(env)
                .message(message)
                .errorType(ErrorType.NOT_FOUND)
                .build();
    }

}
