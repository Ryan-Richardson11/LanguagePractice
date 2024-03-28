package graph

// This file will be automatically regenerated based on the schema, any resolver implementations
// will be copied through when generating and any unknown code will be moved to the end.
// Code generated by github.com/99designs/gqlgen version v0.17.45

import (
	"Rhize3/graph/model"
	"context"
	"fmt"

	"github.com/google/uuid"
	jsonata "github.com/xiatechs/jsonata-go"
)

// CreateTodo is the resolver for the createTodo field.
func (r *mutationResolver) CreateTodo(ctx context.Context, input model.NewTodo) (*model.Todo, error) {
	id := uuid.New().String()
	todo := &model.Todo{
		ID:   id,
		Text: input.Text,
		Done: false,
	}
	r.TodoList = append(r.TodoList, todo)
	return todo, nil
}

// ToggleTodoDone is the resolver for the toggleTodoDone field.
func (r *mutationResolver) ToggleTodoDone(ctx context.Context, id string) (*model.Todo, error) {
	for _, todo := range r.TodoList {
		if todo.ID == id {
			todo.Done = !todo.Done
			return todo, nil
		}
	}
	return nil, nil
}

// RemoveTodo is the resolver for the removeTodo field.
func (r *mutationResolver) RemoveTodo(ctx context.Context, id string) (*model.Todo, error) {
	for i, todo := range r.TodoList {
		if todo.ID == id {
			r.TodoList = append(r.TodoList[:i], r.TodoList[i+1:]...)
			return todo, nil
		}
	}
	return nil, nil
}

// JSONataAll is the resolver for the JSONataAll field.
func (r *mutationResolver) JSONataAll(ctx context.Context, expr string, input map[string]interface{}) (string, error) {
	// Create expression
	e := jsonata.MustCompile(expr)

	// Evaluate expression on input data
	result, err := e.Eval(input)
	if err != nil {
		return "", err
	}

	resultStr := fmt.Sprintf("%v", result)
	return resultStr, nil
}

// Todos is the resolver for the todos field.
func (r *queryResolver) Todos(ctx context.Context) ([]*model.Todo, error) {
	return r.TodoList, nil
}

// Mutation returns MutationResolver implementation.
func (r *Resolver) Mutation() MutationResolver { return &mutationResolver{r} }

// Query returns QueryResolver implementation.
func (r *Resolver) Query() QueryResolver { return &queryResolver{r} }

type mutationResolver struct{ *Resolver }
type queryResolver struct{ *Resolver }
